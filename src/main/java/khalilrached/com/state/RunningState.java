package khalilrached.com.state;

public class RunningState implements State {
    @Override
    public void stop(Context context) {
        System.out.println("The car is stopping");
        context.changeState(new StoppedState());
    }

    @Override
    public void start(Context context) {
        System.out.println("The car is already running");
    }
}
