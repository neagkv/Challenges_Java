package src.main.java.interFaceChallenge;

public class GeneralManger {

    public static void main(String[] args) {

        LouisvilleSlugger rsls = new LouisvilleSlugger();
        LouisvilleSlugger yls = new LouisvilleSlugger();
        Mizuno omiz = new Mizuno();

        Rawling redRawl = new Rawling();
        Rawling yankRawl = new Rawling();
        Spalding oSpald = new Spalding();



        baseBallTeam redsox = new baseBallTeam(redRawl, rsls);
        baseBallTeam yankees = new baseBallTeam(yankRawl, yls);
        baseBallTeam orioles = new baseBallTeam(oSpald, omiz);

    }




}
