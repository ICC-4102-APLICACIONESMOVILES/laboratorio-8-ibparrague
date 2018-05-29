package cl.magnet.mobileappsexample;


import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

import cl.magnet.mobileappsexample.db.Form;
import cl.magnet.mobileappsexample.db.FormViewModel;


public class NewFormFragment extends Fragment {
    private FormViewModel model;
    private EditText etName;
    private EditText etDate;
    private Button buttonSubmit;

    public NewFormFragment() {
        // Required empty public constructor
        //model = ViewModelProviders.of(getActivity()).get(FormViewModel.class);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               String nombre = etName.getText().toString();
               String date = etDate.getText().toString();

            }
        });

    }
    public static NewFormFragment newInstance() {
        NewFormFragment fragment = new NewFormFragment();

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_form, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ViewModelProviders.of(this).get(FormViewModel.class);
        super.onViewCreated(view, savedInstanceState);
        etName = view.findViewById(R.id.editTextName);
        etDate = view.findViewById(R.id.editTextDate);
        buttonSubmit = view.findViewById(R.id.buttonSubmit);
    }
}
