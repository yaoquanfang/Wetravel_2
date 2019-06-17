package com.edu.swufe.wetravel;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SocFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_soc,container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button botn1 = (Button) getActivity().findViewById(R.id.botn1);
        Button botn2 = (Button) getActivity().findViewById(R.id.botn2);
        Button botn3 = (Button) getActivity().findViewById(R.id.botn3);
        Button botn4 = (Button) getActivity().findViewById(R.id.botn4);

        botn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String http="https://jwc.swufe.edu.cn/";
                Intent intent = new Intent(getActivity(), MeishiActivity.class);
//                intent.putExtra("http",http);
                startActivity(intent);
            }
        });
        botn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://mr.baidu.com/g3vlo7v?f=cp&u=6b9cafb9ed70f5c0")));
            }
        });
        botn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.sohu.com/a/258764359_702052")));
            }
        });
        botn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://touch.travel.qunar.com/comment/5774887")));
            }
        });
    }
}
