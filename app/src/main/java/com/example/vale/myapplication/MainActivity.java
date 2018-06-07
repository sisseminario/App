package com.example.vale.myapplication;




import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = (BottomNavigationView) findViewById(R.id.botton_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_contactos:
                            selectedFragment =  new ContactosFragment();
                            break;
                        case R.id.nav_favoritos:
                            selectedFragment =  new FavoritosFragment();
                            break;
                        case R.id.nav_inicio:
                            selectedFragment =  new InicioFragment();
                            break;
                        case R.id.nav_mapas:
                            selectedFragment =  new MapasFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

}
