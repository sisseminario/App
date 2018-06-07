package com.example.vale.myapplication;



import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mMainNav;
    private FrameLayout mMainFrame;

    private InicioFragment inicioFragment;
    private ContactosFragment contactosFragment;
    private FavoritosFragment favoritosFragment;
    private MapasFragment mapasFragment;



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        mMainNav = (BottomNavigationView) findViewById(R.id.botton_nav);

        inicioFragment = new InicioFragment();
        contactosFragment = new ContactosFragment();
        mapasFragment = new MapasFragment();
        favoritosFragment = new FavoritosFragment();

        setFragment(inicioFragment);
        setFragment(contactosFragment);
        setFragment(mapasFragment);
        setFragment(favoritosFragment);

        mMainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case  R.id.nav_inicio:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment (inicioFragment);
                        return true;


                    case R.id.nav_contactos:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(contactosFragment);
                        return true;

                    case R.id.nav_mapas:
                        mMainNav.setItemBackgroundResource(R.color.colorPrimary);
                        setFragment(mapasFragment);
                        return true;

                    case R.id.nav_favoritos:
                        mMainNav.setItemBackgroundResource(R.color.colorAccent);
                        setFragment(favoritosFragment);
                        return true;

                    default:
                        return  true;

                }

            }
        });


    }

    private void setFragment(android.support.v4.app.Fragment fragment) {
        FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }


}
