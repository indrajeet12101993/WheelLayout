package retrofit.com.wheellayout.model;

import java.io.Serializable;

/**
 * Created by atechnos pc on 12/27/2017.
 */

public class MenuImageData implements Serializable {

    public int imageresourse;
    public String imagedescription;

    public MenuImageData(int imageresourse, String imagedescription) {
        this.imageresourse = imageresourse;
        this.imagedescription = imagedescription;
    }

}
