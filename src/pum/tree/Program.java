package pum.tree;

public class Program extends AbstractTree{

    private String name;
    private AbstractTree a;

    public Program(int n, String name, AbstractTree a) {
        super(n);
        this.name = name;
        this.a = a;
    }

    @Override
    public void Verify() {
        a.Verify();
    }

    @Override
    public String ToFASM() {
        StringBuilder sb = new StringBuilder(1024);

        sb.append("; Program name : " + name + "\n");
        sb.append("; Translated in Flat Assembly using PUM\n\n");

        sb.append("format PE CONSOLE 4.0\n");
        sb.append("entry main\n");
        sb.append("\n");
        sb.append("include 'win32ax.inc'\n");

        sb.append("\n");
        sb.append(".code\n");
        sb.append("\n; START OF USER CODE\n\n\n");
        sb.append("\n");
        sb.append("proc " + name + "\n\n");
        sb.append(a.ToFASM());
        sb.append("ret\n");
        sb.append("endp\n");
        sb.append("\nmain:\n");
        sb.append("stdcall " + name + "\n");
        sb.append("\n");
        sb.append("\n; END OF USER CODE\n\n\n");

        sb.append("proc print, format, val\n");
        sb.append("\tpush eax\n");
        sb.append("\tpush edx\n");
        sb.append("\tcinvoke printf, [format], [val]\n");
        sb.append("\tpop edx\n");
        sb.append("\tpop eax\n");
        sb.append("\tret\n");
        sb.append("endp\n");
        sb.append("\n");
        sb.append("\n");
        sb.append("proc waitforchar\n");
        sb.append("\tcinvoke getchar\n");
        sb.append("\tret\n");
        sb.append("endp\n");
        sb.append("\n");
        sb.append("section '.data' data readable writeable\n");
        sb.append("\n");
        sb.append("CRLF\tdb '',13,10,0  ; carriage return and linefeed\n");
        sb.append("\n");
        sb.append("section '.idata' import data readable writeable\n");
        sb.append("\n");
        sb.append("library kernel32,'kernel32.dll',\\\n");
        sb.append("\tuser32,  'user32.dll',\\\n");
        sb.append("\tmsvcrt,  'msvcrt.dll'\n");
        sb.append("\n");
        sb.append("include 'api\\kernel32.inc'\n");
        sb.append("include 'api\\user32.inc'\n");
        sb.append("\n");
        sb.append("import msvcrt,\\\n");
        sb.append("\tprintf, 'printf',\\\n");
        sb.append("\tgetchar,'getchar'\n");
        sb.append("\n");
        sb.append("; eof");

        return sb.toString();
    }
}
