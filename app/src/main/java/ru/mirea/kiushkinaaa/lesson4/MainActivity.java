package ru.mirea.kiushkinaaa.lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

import ru.mirea.kiushkinaaa.lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private Fragment playerFragment;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        playerFragment = new PlayerFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.frameLayout, playerFragment).commit();

    }
//    //    @Override
//    public void onConfigurationChanged(Configuration newConfig) {
//        super.onConfigurationChanged(newConfig);
//        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
//        {
//            fragmentManager.beginTransaction().replace(R.id.frameLayout, playerFragment).commit();
//            //add your code what you want to do when screen on PORTRAIT MODE
//        }
////        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
////        {
////            fragmentManager.beginTransaction().replace(R.id.frameLayout).commit();
////            //add your code what you want to do when screen on LANDSCAPE MODE
////        }
//    }


}
