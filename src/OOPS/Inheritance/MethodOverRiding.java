package OOPS.Inheritance;

class bank {

    int getrateofinterest() {

        return 0;

    }

}

class SBI extends bank {

    int getrateofinterest() {

        return 12;
    }
}

class ICICI extends bank {

    int getrateofinterest() {

        return 10;
    }
}

class Axis extends bank {

    int getrateofinterest() {

        return 32;
    }
}

public class MethodOverRiding {

    public static void main(String[] args) {

        SBI sbiobj = new SBI();
        System.out.println(sbiobj.getrateofinterest());

        ICICI iciciobj = new ICICI();
        System.out.println(iciciobj.getrateofinterest());

        Axis Axisobj = new Axis();
        System.out.println(Axisobj.getrateofinterest());


    }


}
