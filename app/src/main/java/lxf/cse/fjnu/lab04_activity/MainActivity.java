package lxf.cse.fjnu.lab04_activity;

        import android.content.Intent;
        import android.preference.PreferenceFragment;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //将PrefsFragement装入content容器
        getFragmentManager().beginTransaction().replace(android.R.id.content, new PrefsFragement()).commit();

    }

    public static class PrefsFragement extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
