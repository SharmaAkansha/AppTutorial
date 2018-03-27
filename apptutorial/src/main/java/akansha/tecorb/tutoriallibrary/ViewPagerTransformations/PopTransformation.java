package akansha.tecorb.tutoriallibrary.ViewPagerTransformations;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by tecorb on 27/3/18.
 */

public class PopTransformation implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        page.setTranslationX(-position * page.getWidth());

        if (Math.abs(position) < 0.5) {
            page.setVisibility(View.VISIBLE);
            page.setScaleX(1 - Math.abs(position));
            page.setScaleY(1 - Math.abs(position));
        } else if (Math.abs(position) > 0.5) {
            page.setVisibility(View.GONE);
        }

    }
}
