package khalilrached.com.state;

public class InitialState implements State{
    @Override
    public void stop(Context context) {
        System.out.println("The car is already stopped");
    }

    @Override
    public void start(Context context) {
        System.out.println("The car is starting");
        context.changeState(new RunningState());
    }
}
