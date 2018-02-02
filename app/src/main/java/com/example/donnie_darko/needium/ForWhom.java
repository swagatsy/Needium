package com.example.donnie_darko.needium;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.ClipboardManager;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.CLIPBOARD_SERVICE;
//import static com.example.donnie_darko.needium.R.id.spinner;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ForWhom.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ForWhom#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForWhom extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    TextView tv;
    ImageButton s1,s2,s3,s4;
//    TextView tv = (TextView) getView().findViewById(R.id.Scheme);

//    private OnFragmentInteractionListener mListener;

    public ForWhom() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForWhom.
     */
    // TODO: Rename and change types and number of parameters
    public static ForWhom newInstance(String param1, String param2) {
        ForWhom fragment = new ForWhom();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        inflater.inflate(R.layout.fragment_for_whom, container, false);
        View v = inflater.inflate(R.layout.fragment_for_whom, container, false);
//        tv = (TextView) v.findViewById(R.id.Scheme);
//        tv.setMovementMethod(new ScrollingMovementMethod());
//      I.

        s1 = (ImageButton) v.findViewById(R.id.imageButton) ;
        s2 = (ImageButton) v.findViewById(R.id.imageButton2) ;
        s3 = (ImageButton) v.findViewById(R.id.imageButton3) ;
        s4 = (ImageButton) v.findViewById(R.id.imageButton4) ;

        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);
        s4.setOnClickListener(this);

//        List<String> names = new ArrayList<String>();
//        names.add("Select a filter");
//        names.add("Student");
//        names.add("Teacher");
//        ArrayAdapter<String> data = new ArrayAdapter<String>(this.getContext(),android.R.layout.simple_spinner_item,names);
//        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        Spinner spin;
//        spin = (Spinner) v.findViewById(R.id.spinner);
//        spin.setAdapter(data);
//        spin.setOnItemSelectedListener(this);

        return v;
    }






//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//            String item = parent.getItemAtPosition(position).toString();
//            if(item.equals("Teacher"))
//            {
//                tv.setText(val1);
//                tv.setTextIsSelectable(true);
//            }
//            else
//            {
//                tv.setText(val2);
//                tv.setTextIsSelectable(true);
//            }
//            tv.setTextIsSelectable(true);
////        textview.setTextIsSelectable(true);
//        tv.setFocusable(true);
//        tv.setFocusableInTouchMode(true);
//            boolean vvv = tv.isTextSelectable();
//            if(vvv)
//            {
//                System.out.println("SUCCESS!\n");
//            }
//    }


    @Override
    public void onClick(View v) {
        if(v==s1)
        {
            Intent i = new Intent(this.getContext(),SchemeActivity.class);
            i.putExtra("Category","Students");
            startActivity(i);
        }
        else if(v==s2)
        {
            Intent i = new Intent(this.getContext(),SchemeActivity.class);
            i.putExtra("Category","Teachers");
            startActivity(i);
        }
        else if(v==s3)
        {

        }
        else if(v==s4)
        {

        }
        else
        {

        }
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
