public class Fronta {
    private Zak[] frontaZaku;
    private int kapacita = 20;
    private int front;
    private int rear;
    private int size;

    public Fronta() {
        this.frontaZaku = new Zak[kapacita];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void addZak(Zak zak) {
        try{
            jePlny();
            rear = (rear + 1) % kapacita;
            frontaZaku[rear] = zak;
            size++;
        }catch(FrontaSizeException e){
            System.err.println(("List zaku je prazdny"));
        }

    }

    public void removeFirstZak() {
        try{
            jePrazdny();
            System.out.println("Zak: " + frontaZaku[front].getJmenoPrijmeni() + " byl obslouzen");
            frontaZaku[front] = null;
            front = (front + 1) % kapacita;
            size--;
        }catch(FrontaSizeException e){
            System.err.println((e.getMessage()));
        }
    }

    public void printFronta() {
        try{
            jePrazdny();
            for (int i = 0; i < size; i++) {
                int index = (front + i) % kapacita;
                System.out.println(frontaZaku[index].getJmenoPrijmeni());
            }
        }catch(FrontaSizeException e) {
            System.err.println((e.getMessage()));
        }
    }

    public void chodPrvniho(){
        try{
            jePrazdny();
            System.out.println("Chod prvniho zaka: "+frontaZaku[front].getJmenoPrijmeni()+" je: "+frontaZaku[front].getCisloChodu());
        }catch(FrontaSizeException e){
            System.err.println((e.getMessage()));
        }
    }

    public void findZak(String prijmeni) {
        try{
            jePrazdny();
            for (int i = 0; i < size; i++) {
                int index = (front + i) % kapacita;
                if (frontaZaku[index].getPrijmeni().equals(prijmeni)) {
                    System.out.println("Zak nalezen: "+frontaZaku[index].getJmenoPrijmeni()+" chod: "+frontaZaku[index].getCisloChodu());
                    break;
                }
            }
        }catch(FrontaSizeException e){
            System.err.println((e.getMessage()));
        }
    }

    public void zvetsitKapacitu(int number){
        kapacita += number;
    }

    public void jePlny(){
        if (size == kapacita){
            throw new FrontaSizeException("List zaku je plny");
        }
    }

    public void jePrazdny(){
        if (size == 0){
            throw new FrontaSizeException("List zaku je prazdny");
        }
    }

    public int getKapacita() {
        return kapacita;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    public Zak[] getFrontaZaku() {
        return frontaZaku;
    }

    public void setFrontaZaku(Zak[] frontaZaku) {
        this.frontaZaku = frontaZaku;
    }

}
