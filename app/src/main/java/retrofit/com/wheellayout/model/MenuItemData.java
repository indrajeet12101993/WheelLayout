package retrofit.com.wheellayout.model;

import android.content.Context;
import android.view.LayoutInflater;

import java.io.Serializable;
import java.util.List;

/**
 * Created by atechnos pc on 12/27/2017.
 */

public class MenuItemData implements Serializable {
   public String mtitle;

    public MenuItemData(String mtitle) {
        this.mtitle = mtitle;
    }
}
