package nrdzs.cs465.illinois.edu.spot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.chrisbanes.photoview.PhotoView;

// Instances of this class are fragments representing a single
// object in our collection.
public class DemoObjectFragment extends Fragment {
    public static final String ARG_OBJECT = "index";

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // The last two arguments ensure LayoutParams are inflated
        // properly.
        View rootView = inflater.inflate(
                R.layout.fragment_detailed_photo_frame, container, false);


        Bundle args = getArguments();
        int photo_index = args.getInt(ARG_OBJECT);


        PhotoView photoView = (PhotoView) rootView.findViewById(R.id.detailed_photo_view);

        if(photo_index % 2 ==0) {
            photoView.setImageResource(R.drawable.grainger_image_1);
        } else {
            photoView.setImageResource(R.drawable.grainger_image_2);

        }

        return rootView;
    }
}
