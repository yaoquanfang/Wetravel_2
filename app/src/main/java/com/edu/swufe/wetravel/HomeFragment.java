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
public class HomeFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_home,container);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Button btn1=(Button)getActivity().findViewById(R.id.button);
        Button btn2=(Button)getActivity().findViewById(R.id.button2);
        Button btn3=(Button)getActivity().findViewById(R.id.button3);
        Button btn5=(Button)getActivity().findViewById(R.id.button5);
        Button btn6=(Button)getActivity().findViewById(R.id.button6);
        Button btn7=(Button)getActivity().findViewById(R.id.button7);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                String http="https://jwc.swufe.edu.cn/";
                Intent intent = new Intent(getActivity(),SanyaActivity.class);
//                intent.putExtra("http",http);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://mr.baidu.com/0yjf22v?f=cp&u=5a23d1583f9c5b98")));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://mr.baidu.com/b493zcd?f=cp&u=74d385c8e0b4e43d")));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),GonglueActivity.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://hotel.qunar.com/")));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://flight.qunar.com/?kwid=12012806&cooperate=baidu50")));
            }
        });
    }
}

