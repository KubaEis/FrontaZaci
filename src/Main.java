void main() {
    Fronta fronta = new Fronta();

    fronta.addZak(new Zak("ondra musil", 1));
    fronta.addZak(new Zak("misa pobuda", 3));
    fronta.addZak(new Zak("dan fuchs", 2));

    fronta.printFronta();

    fronta.removeFirstZak();

    fronta.printFronta();

    fronta.chodPrvniho();


    fronta.findZak("fuchs");

}
