package ogliari.com.hotelaria;


import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelDetalheFragment extends Fragment {

    public static final String TAG_DETALHE = "tagDetalhe";
    private Hotel objHotel;
    public static HotelDetalheFragment novaInstancia(Hotel hotel){
        Bundle parametros = new Bundle();
        parametros.putSerializable("hotel", hotel);
        HotelDetalheFragment fragment = new HotelDetalheFragment();
        fragment.setArguments(parametros);
        return fragment;
    }

    public HotelDetalheFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        objHotel = (Hotel) getArguments().getSerializable("hotel");
        setHasOptionsMenu(true);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_hotel_detalhe,
                container, false);
        TextView txtNome = (TextView) layout.findViewById(R.id.txtNome);
        TextView txtEndereco = (TextView) layout.findViewById(R.id.txtEndereco);
        RatingBar rbtEstrelas = (RatingBar) layout.findViewById(R.id.rbtEstrelas);
        if(objHotel != null){
            txtNome.setText(objHotel.getNome());
            txtEndereco.setText(objHotel.getEndereco());
            rbtEstrelas.setRating(objHotel.getEstrelas());
            layout.setBackground(getResources().getDrawable(objHotel.getImagem()));
        }
        return layout;
    }

}
