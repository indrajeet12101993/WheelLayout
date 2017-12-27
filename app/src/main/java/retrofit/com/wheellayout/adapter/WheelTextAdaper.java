package retrofit.com.wheellayout.adapter;

import android.content.Context;
import android.support.v4.app.ActivityCompat;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

import github.hellocsl.cursorwheel.CursorWheelLayout;
import retrofit.com.wheellayout.R;
import retrofit.com.wheellayout.model.MenuItemData;

/**
 * Created by atechnos pc on 12/27/2017.
 */

public class WheelTextAdaper extends CursorWheelLayout.CycleWheelAdapter {
    private Context mcontext;
    private List<MenuItemData> menuitems;
    private LayoutInflater layoutInflater;
    private int gravity;

    public WheelTextAdaper(Context mcontext, List<MenuItemData> menuitems) {
        this.mcontext = mcontext;
        this.menuitems = menuitems;
        gravity= Gravity.CENTER;
        layoutInflater= LayoutInflater.from(mcontext);
    }

    public WheelTextAdaper(Context mcontext, List<MenuItemData> menuitems, int gravity) {
        this.mcontext = mcontext;
        this.menuitems = menuitems;
        this.gravity = gravity;
        layoutInflater= LayoutInflater.from(mcontext);
    }

    @Override
    public int getCount() {
        return menuitems.size();
    }

    @Override
    public View getView(View parent, int position) {
        MenuItemData itemdata= getItem(position);
        View root =layoutInflater.inflate(R.layout.wheel_text_layout,null,false);
        TextView tv_wheel_text_item= (TextView) root.findViewById(R.id.tv_wheel_text_item);
        tv_wheel_text_item.setVisibility(View.VISIBLE);
        tv_wheel_text_item.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);
        tv_wheel_text_item.setText(itemdata.mtitle);
        if(tv_wheel_text_item.getLayoutParams() instanceof FrameLayout.LayoutParams)
            ((FrameLayout.LayoutParams)tv_wheel_text_item.getLayoutParams()).gravity= gravity;
        if(position == 4){
            tv_wheel_text_item.setTextColor(ActivityCompat.getColor(mcontext,R.color.red));

        }
        return root;
    }

    @Override
    public MenuItemData getItem(int position) {

        return menuitems.get(position);
    }
}
