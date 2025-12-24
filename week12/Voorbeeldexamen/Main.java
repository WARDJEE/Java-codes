package week12.Voorbeeldexamen;

public class Main {
    public static void main() {
        //DEEL1:
        System.out.println("DEEL 1: ATOMEN");
        NietMetaal h = new NietMetaal("Waterstof","H", 1, 1);
        h.setIsolerend(false);
        NietMetaal o = new NietMetaal("Zuurstof", "O", 8, 15.9);
        NietMetaal c = new NietMetaal("Koolstof", "C", 6, 12);
        Metaal fe = new Metaal("Ijzer", "Fe", 26, 55.8);
        fe.setGeleiding(2.3);
        Metaal cu = new Metaal("Koper","Cu",	29,	63.546);
        cu.setGeleiding(17);
        Metaal au	= new Metaal("Goud", "Au",	79,	196.96657);
        TabelMendeljev tabelMendeljev = new TabelMendeljev();
        tabelMendeljev.voegAtoomToe(h);
        tabelMendeljev.voegAtoomToe(o);
        tabelMendeljev.voegAtoomToe(c);
        tabelMendeljev.voegAtoomToe(fe);
        tabelMendeljev.voegAtoomToe(cu);
        tabelMendeljev.voegAtoomToe(au);
        tabelMendeljev.print();
        tabelMendeljev.printMetalen();

        //DEEL2:
        System.out.println("DEEL 2: MOLECULES");
    /*  Molecule water = new Molecule();
        water.voegAtoomToe(h, 2);
        water.voegAtoomToe(o, 1);
        System.out.println("Water:" + water);
        System.out.println("Massa van 1 molecule water: " + water.getMassa());
        Molecule glucose = new Molecule();
        glucose.voegAtoomToe(h, 12);
        glucose.voegAtoomToe(c, 6);
        glucose.voegAtoomToe(o, 6);
        System.out.println("Glucose: " + glucose);
        System.out.println("Massa van 1 molecule glucose: " + glucose.getMassa());
        Molecule methaan = new Molecule();
        methaan.voegAtoomToe(c, 1);
        methaan.voegAtoomToe(h, 4);
        System.out.println("Methaan: " + methaan);
        System.out.println("Massa van 1 molecule methaan: " + methaan.getMassa());
        methaan.voegAtoomToe(c, -10);
     */
        //DEEL3:
     /* System.out.println("DEEL 3: Reacties");
        Reactie reactie = new Reactie("Reactie van " + methaan + " en " + glucose, methaan, glucose);
        reactie.start();
        reactie.printVerslag();
        reactie = new Reactie("Reactie van restproduct van de glucose (" + glucose + ") met alle elementen", glucose, tabelMendeljev);
        reactie.start();
        reactie.printVerslag();
      */
    }
}

