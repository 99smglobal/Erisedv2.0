package in.erised.android.erised;

/**
 * Created by Akshay on 25/07/15.
 */
public final class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "Walkway Black", "Walkway Black.ttf");
    }
}
