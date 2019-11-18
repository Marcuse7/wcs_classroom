public class Classroom {


    public static void main(String[] args) {

        Wilder jeanclaudeWilder = new Wilder();
        Wilder henriWilder = new Wilder("Henri", false);
        Wilder markus = new Wilder();

        jeanclaudeWilder.setFirstname("Jean-Claude");
        jeanclaudeWilder.setPresent(true);

        markus = new Wilder("Markus", true);

        System.out.println(jeanclaudeWilder.whoAmI());
        System.out.println(henriWilder.whoAmI());
        System.out.println(markus.whoAmI());

    }
   

}