package listener;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

//DOESN'T WORK YET, BUT ON IT


public class Listener {


    public static void main(String[] args) {
        Firebase handle;
        handle = new Firebase("https://suppy.firebaseio.com");

        handle.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snap) {
                System.out.println(snap.getName() + " -> " + snap.getValue());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }

        });
    }


}
