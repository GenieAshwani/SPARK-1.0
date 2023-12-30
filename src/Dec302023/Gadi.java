package Dec302023;

class Gadi {

       Gadi manufacture()
        {
            System.out.println("Gadi lelo");
            return new Gadi();
        }
}

class Ford extends Gadi{
    @Override
    Ford manufacture() {
        System.out.println("Ford ki gadi");
        return new Ford();
    }
}
