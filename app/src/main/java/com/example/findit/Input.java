package com.example.findit;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Input extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {
Button btn;
TextView dt;
ImageView img, imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        btn = findViewById(R.id.button); dt = findViewById(R.id.textView); img = (ImageView)findViewById(R.id.imageView2); imageView = (ImageView)findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                Calendar c = Calendar.getInstance();
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog dpc = new DatePickerDialog(Input.this, Input.this,
                        year,
                        month,
                        day);
               dpc.show();;

            }
        });

    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int mont, int dayy) {
        imageView.setImageResource(R.drawable.img_1);
if (dayy >= 21 && mont==2 || dayy<=19 && mont==3){
    //ARIES
dt.setText("Aries is the first fire sign in the zodiac, the other fire signs being Leo and Sagittarius. Individuals born between these dates, depending on which system of astrology they subscribe to, may be called Arians or Ariens." + "\n"+
        "The color for Aries is red.In astrology, Aries is the cardinal sign of the fire trigon. It is one of the six positive signs.");
img.setImageResource(R.drawable.aries); btn.setText("TRY AGAIN");
}else if(dayy >= 20 && mont ==3  || dayy<= 20 && mont==4) {
    //TAURUS
    dt.setText("The sign of Taurus is associated with several myths and bull worship from several ancient cultures."+"\n" +
            "It was the first sign of the zodiac established among the Mesopotamians, who called it \"The Great Bull of Heaven,\" as it was the constellation through which the Sun rose on the vernal equinox at that time, that is the Early Bronze Age, from about 4000 BC to 1700 BC.\n");
    img.setImageResource(R.drawable.tauros); btn.setText("TRY AGAIN");
}else if(dayy >= 21 && mont ==4  || dayy<= 21 && mont==5){
    ///GEMINI
    dt.setText("Gemini is associated with the myth of Castor and Pollux. Pollux was the son of Zeus, who seduced Leda, while Castor was the son of Tyndareus, the king of Sparta and Leda's husband. When Castor died, because he was a mortal,\n" +
            "Pollux begged his father Zeus to give Castor immortality, which was done through uniting them together in the heavens.");
    img.setImageResource(R.drawable.gemini);btn.setText("TRY AGAIN");
}else if(dayy >= 22 && mont ==5  || dayy<= 22 && mont==6){
    //CANCER
    dt.setText("Cancer is a cardinal water sign. Represented by the crab, this oceanic crustacean seamlessly weaves between the shore, representing Cancer’s ability to exist in both emotional and material realms. \n" +
            "Cancers are highly intuitive and their psychic abilities manifest in tangible spaces"+ " \n" +
            "Cancers can effortlessly pick up the energies in a room." + " \n" +
            "Cancer is ruled by the moon, the celestial body that represents comfort, self-care, and maternal energies. " + " \n" +
            "Cancers attract friends and lovers through their loyalty, commitment, and emotional depth." );
    img.setImageResource(R.drawable.cancer);btn.setText("TRY AGAIN");
}else if(dayy >= 23 && mont ==6  || dayy<= 22 && mont==7){
    //LEO
    dt.setText("Leo is represented by the lion, and these spirited fire signs are the kings and queens of the celestial jungle."+ "\n" +
            "Leo are delighted to embrace their royal status: Vivacious, theatrical, and passionate," + "\n" +
           "Leos love to bask in the spotlight and celebrate themselves"  + "\n" +
            " Leo is ruled by the sun, the dazzling celestial body that governs life and vitality." + "\n"+
            "In tarot, Leo is represented by the “strength” card, which depicts the divine expression of physical, mental, and emotional fortitude.");
    img.setImageResource(R.drawable.leo);btn.setText("TRY AGAIN");

}else if(dayy >= 23 && mont ==7  || dayy<= 22 && mont==8){
    //VIRGO
    dt.setText(" Virgo is an earth sign historically represented by the goddess of wheat and agriculture, an association. " +"\n" + "that speaks to Virgo’s deep-rooted presence in the material world. " +"\n" +
           "Virgos are logical, practical, and systematic in their approach to life. " +"\n" +
            "Virgo rules the digestive system, which makes these earth signs especially attuned to the ingredients that make up a whole — in food and in everything else. " +"\n" +
            "A Virgo deals with information like a computer, transforming even the most jumbled set of information into organized, clear concepts.");

    img.setImageResource(R.drawable.virgo);btn.setText("TRY AGAIN");
}else if(dayy >= 23 && mont ==8  || dayy<= 23 && mont==9){
    //LIBRA
    dt.setText("Libra is obsessed with symmetry and strives to create equilibrium in all areas of life." + "\n" +
            "Relationships are paramount for Libras, who find balance in companionship. " +"\n" +
            "Libras, when they are regularly coupled, must be careful about seeking attention outside the agreed-upon boundaries of their relationship.");
    img.setImageResource(R.drawable.libra);btn.setText("TRY AGAIN");
}else if(dayy >= 24 && mont ==9  || dayy<= 22 && mont==10){
    //SCORPIO
    dt.setText("Scorpio is a water sign that derives its strength from the psychic, emotional realm. \n" +
            "Scorpio is ruled by Pluto, the planet that governs both destruction and transformation. \n" +
            "Scorpios must remember that if controlled by their egos, they are at risk of poisoning themselves. ");
    img.setImageResource(R.drawable.scorpio);btn.setText("TRY AGAIN");
}else if(dayy >= 23 && mont ==10  || dayy<= 21 && mont==11){
    //SAGITTARIUS
    dt.setText("Sagittarius is a mutable sign, meaning it is associated with adaptability and flexibility. \n" +
            "Sagittarians are born to explore and it is critical that these archers have the freedom to roam.  \n" + "Sagittarius' ruling planet is Jupiter, the planet of abundance. ");
    img.setImageResource(R.drawable.sag);btn.setText("TRY AGAIN");
}else if(dayy >= 22 && mont ==11 || dayy<= 19 && mont==0){
    //CAPRICOM
    dt.setText("Sagittarius' ruling planet is Jupiter, the planet of abundance. \n" +
            "Capricorns are said to age backwards: they become increasingly youthful, optimistic, and playful as they mature. \n" +
            "Capricorn is symbolized by the sea goat, a mythological creature with the body of a goat and tail of a fish. ");
    img.setImageResource(R.drawable.capricorn_);btn.setText("TRY AGAIN");
}else if(dayy >= 20 && mont ==0  || dayy<= 18 && mont==1){
    //AQUARIUS
    dt.setText("Aquarius is holding a vase, which pours new streams of inspiration to cultivate longevity, healing, and hope. \n" +
            "Aquarius is determined to make a powerful difference in the world. ");
    img.setImageResource(R.drawable.aquarius);btn.setText("TRY AGAIN");
}else if(dayy >= 19 && mont ==1  || dayy<= 20 && mont==2){
    //PISCES
    dt.setText("Pisces effortlessly adapts to their surroundings. \n" +
            "Any relationship with mystical Pisces is guaranteed to involve deep spiritual exploration.");
    img.setImageResource(R.drawable.pisces);btn.setText("TRY AGAIN");
}else {
    Toast.makeText(Input.this, "Please Enter your DOB Properly", Toast.LENGTH_SHORT).show();
}




    }
}