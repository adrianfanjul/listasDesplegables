package com.tokioschol.listasdesplegables;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.tokioschol.listasdesplegables.databinding.ActivityCardViewBinding;

public class CardViewActivity extends AppCompatActivity {

    private static final String TAG ="CardViewActivity";
    private ActivityCardViewBinding bindView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1 Hay que mirar como sellama el layout=activity_card_view
        bindView= ActivityCardViewBinding.inflate(getLayoutInflater());
        setContentView(bindView.getRoot());
        makeCard();
        setListeners();
    }

    private void setListeners() {
        bindView.card.cardviewCardBtn.setOnClickListener(view ->{
            Log.i(TAG,"Hemos pulsado el boton");
            //TODO: Vamos a otra pantalla
        });
    }

    private void makeCard() {
        bindView.card.cardviewCardImg.setImageResource(R.drawable.img_cat);
        bindView.card.cardviewCardTitle.setText(R.string.cardTitle);
        bindView.card.cardviewCardSubTitle.setText(R.string.cardSubTitle);
    }
}