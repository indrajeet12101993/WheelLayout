package retrofit.com.wheellayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

import github.hellocsl.cursorwheel.CursorWheelLayout;
import retrofit.com.wheellayout.R;
import retrofit.com.wheellayout.model.MenuImageData;
import retrofit.com.wheellayout.model.MenuItemData;

/**
 * Created by atechnos pc on 12/27/2017.
 */

public class WheelImageAdapter extends CursorWheelLayout.CycleWheelAdapter {
    private Context mcontext;
    private List<MenuImageData> menuitems;
    private LayoutInflater layoutInflater;
    private int gravity;

    public WheelImageAdapter(Context mcontext, List<MenuImageData> menuitems) {
        this.mcontext = mcontext;
        this.menuitems = menuitems;
        layoutInflater= LayoutInflater.from(mcontext);
    }

    @Override
    public int getCount() {
        return menuitems.size();
    }

    @Override
    public View getView(View parent, int position) {
        MenuImageData itemdata= getItem(position);
        View root =layoutInflater.inflate(R.layout.wheel_image_layout,null,false);
        ImageView iv_wheel_item= (ImageView)root.findViewById(R.id.iv_wheel_item);
        iv_wheel_item.setImageResource(itemdata.imageresourse);
        return root;
    }

    @Override
    public MenuImageData getItem(int position) {
        return menuitems.get(position);
    }
}
