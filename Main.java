class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Coral Crown", "Darren Korb", 4.07);
        Song song2 = new Song("CASANOVE POSSE", "ALI", 4.00);
        Song song3 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);

        // Test NAList
        NAList<Song> nAList = new NAList<>();
        System.out.println("NAList:");
        System.out.println(nAList);
        nAList.addy(song1);
        nAList.addy(song3);
        nAList.addy(song2);
        nAList.addy(song1);
        System.out.println(nAList);
        nAList.removy(1);
        System.out.println(nAList);

        // Test NSLList
        NSLList<Song> nSLList = new NSLList<>();
        System.out.println("NSLList:");
        System.out.println(nSLList);
        nSLList.addy(song1);
        nSLList.addy(song3);
        nSLList.addy(song2);
        nSLList.addy(song1);
        System.out.println(nSLList);
        nSLList.removy(1);
        System.out.println(nSLList);

        // Test NDLList
        NDLList<Song> nDLList = new NDLList<>();
        System.out.println("NDLList:");
        System.out.println(nDLList);
        nDLList.addy(song1);
        nDLList.addy(song3);
        nDLList.addy(song2);
        nDLList.addy(song1);
        System.out.println(nDLList);
        nDLList.removy(1);
        System.out.println(nDLList);
    }
}
