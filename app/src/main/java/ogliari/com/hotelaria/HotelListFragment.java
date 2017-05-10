package ogliari.com.hotelaria;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import ogliari.com.hotelaria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelListFragment extends ListFragment {


    public HotelListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ArrayAdapter<Hotel> adapter =
                new ArrayAdapter<Hotel>(inflater.getContext(),
                        android.R.layout.simple_list_item_1, Hotel.hoteis);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_hotel_list, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Activity activity = getActivity();
        if(activity instanceof HotelListListener){
            Hotel hotel = (Hotel) l.getItemAtPosition(position);
            HotelListListener listener = (HotelListListener)activity;
            listener.onClickHotel(hotel);
        }
    }

    public interface HotelListListener {
        public void onClickHotel(Hotel hotel);
    }
}
