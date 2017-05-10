package ogliari.com.hotelaria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class HotelDetalheActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detalhe);
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            Hotel hotel = (Hotel) intent.getSerializableExtra("hotel");
            HotelDetalheFragment fragmento = HotelDetalheFragment.novaInstancia(hotel);
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.detalhe, fragmento, HotelDetalheFragment.TAG_DETALHE);
            ft.commit();
        }
    }

}
