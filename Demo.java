class  Demo
{
    public static void main(String[] args) {
        System.out.println("Testing Selenium...");
        System.out.println(20*20);
        int num = 100;
        System.out.println(num);
        String name = "Chamrouen";
        System.out.println(name);
        final int id = 2214;
        System.out.println(id);
        float longnum = 7.75f;
        System.out.println(longnum);
        double longdouble = 55.55d;
        System.out.println(longdouble);
        int wideCast = 91;
        double db = wideCast;
        System.out.println(db);
        double dbnr = 11.11d;
        int narrow = (int)dbnr;
        System.out.println(narrow);
        String txtCount = "bb c616 8016 8542c f6fd3ae637bde395c73b76f01f";
        System.out.println("This number of text: "+txtCount.length());
        System.out.println("This text to lower case: "+txtCount.toLowerCase());
        System.out.println("This text to upper case: "+txtCount.toUpperCase());
        System.out.println("Find the idex of c616 "+txtCount.indexOf("c616"));
        System.out.println("Find the idex of c616 "+txtCount.indexOf("8016"));
        String fName = "Chamrouen ", lName = "Sann";
        System.out.println(fName.concat(lName));
        String ns1 = "10";
        int ns2 = 10;
        String ns = ns1 + ns2;
        System.out.println(ns);
    }
}  