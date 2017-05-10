package ogliari.com.hotelaria;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements HotelListFragment.HotelListListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_barra, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClickHotel(Hotel hotel) {
        View fragmentConteiner = findViewById(R.id.detalhe);
        if(fragmentConteiner!= null){
            HotelDetalheFragment fragmento = HotelDetalheFragment.novaInstancia(hotel);
            HotelDetalheFragment.novaInstancia(hotel);
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.detalhe, fragmento, HotelDetalheFragment.TAG_DETALHE);
            ft.commit();
        }else{
            Intent intent = new Intent(this, HotelDetalheActivity.class);
            intent.putExtra("hotel", hotel);
            startActivity(intent);
        }
    }
}
