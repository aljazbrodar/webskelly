import java.io.*;

/**
 * file1
 */
public class webskelly {

    public static void main(String[] args) {
        try {
            File f=new File(System.getProperty("user.dir")+"\\Webapp");
            f.mkdir();
            File c=new File(System.getProperty("user.dir")+"\\Webapp\\css");
            c.mkdir();
            File j=new File(System.getProperty("user.dir")+"\\Webapp\\js");
            j.mkdir();
            File i=new File(System.getProperty("user.dir")+"\\Webapp\\images");
            i.mkdir();

            File index=new File(System.getProperty("user.dir")+"\\Webapp\\index.html");
            index.createNewFile();
            File css=new File(System.getProperty("user.dir")+"\\Webapp\\css\\style.css");
            css.createNewFile();
            File js=new File(System.getProperty("user.dir")+"\\Webapp\\js\\main.js");
            js.createNewFile();

            PrintWriter pw=new PrintWriter(new FileWriter(System.getProperty("user.dir")+"\\Webapp\\index.html"));
            pw.println("<!DOCTYPE html>");
            pw.println("<html lang='en'>");
            pw.println("<head>");
            pw.println("<meta charset=\"UTF-8\">");  
            pw.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
            pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            pw.println("<title>Document</title>");
            pw.println("<link rel=\"stylesheet\" href=\"css\\style.css\">");
            pw.println("</head>");
            pw.println("<body>");
            pw.println("<h1>Webskelly works!</h1>");
            pw.println("</body>");
            pw.println("</html>");
            pw.close();

            PrintWriter pww=new PrintWriter(new FileWriter(System.getProperty("user.dir")+"\\Webapp\\css\\style.css"));
            pww.println("*{margin:0;padding:0;}");
            pww.println("body{background:cyan;}");
            pww.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}