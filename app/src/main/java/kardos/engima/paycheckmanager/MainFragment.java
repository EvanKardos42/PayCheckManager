package kardos.engima.paycheckmanager;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    ArrayList<FractionOfCheck> check;
    private ListView lv;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        check = new ArrayList<>();
        check.add(new FractionOfCheck());
        check.add(new FractionOfCheck());
        check.add(new FractionOfCheck());
        check.add(new FractionOfCheck());
        check.add(new FractionOfCheck());
        check.add(new FractionOfCheck());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container,false);
        lv = v.findViewById(R.id.listview_display_money);
        PaycheckAdapter adapter = new PaycheckAdapter(check,getContext());
        lv.setAdapter(adapter);
        return v;
    }


    private class PaycheckAdapter extends ArrayAdapter<FractionOfCheck> {
        ArrayList<FractionOfCheck> data;

        public PaycheckAdapter(ArrayList<FractionOfCheck> data,@NonNull Context context) {
            super(context, R.layout.acitivty_list_item);
            this.data = data;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            FractionOfCheck fc = data.get(position);
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.acitivty_list_item,null, true);

            TextView describe = convertView.findViewById(R.id.textview_describtion);
            TextView money = convertView.findViewById(R.id.textview_money);

            describe.setText(fc.getTile());
            money.setText(String.valueOf(fc.getAmount()));

            return convertView;
        }

        @Override
        public int getCount() {
            return data.size();
        }
    };

}
