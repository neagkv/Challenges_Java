package src.interFaceChallenge;



  /*
    interface challenge:
follow the example we did in class this morning that used the Computer class and had two variables
in it - one for a HardDrive and one for a Monitor. We used interfaces to decouple our computer class
from any one HardDrive or MonitorClass. We did this by changing the instance variables of the Computer
class from WesterDigitalHardDrive to HardDriveInterface. Then we had WesterDigitalHardDrive implement
the (empty)HardDriveInterface. This decouples our Computer class from any one HardDrive or Monitor.
Now, we can use any HardDrive class that implements HardDriveInterface as the depenedency (instance variable)
in the Computer class. We then set the actual hard drive and/or monitor to use in the Computer class by using
the Computer constructor or the Comuter setter methods. Your challenge is to replicate this idea we demonstrated
with the Computer class. But don't use a Computer class. Use something else. It could be a Car, a Classroom, a Boat,
a Plane, whatever. Then create a controller method (the main())that demonstrates the use of your new (decoupled)
Boat/Plane/Car whatever.
     */


public class baseBallTeam {

    private Balls newBall;
    private Bats newBats;


    public baseBallTeam(Balls newBall, Bats newBats) {
        this.newBall = newBall;
        this.newBats = newBats;
    }

    public Balls getNewBall() {
        return newBall;
    }

    public void setNewBall(Balls newBall) {
        this.newBall = newBall;
    }

    public Bats getNewBats() {
        return newBats;
    }

    public void setNewBats(Bats newBats) {
        this.newBats = newBats;
    }
}
