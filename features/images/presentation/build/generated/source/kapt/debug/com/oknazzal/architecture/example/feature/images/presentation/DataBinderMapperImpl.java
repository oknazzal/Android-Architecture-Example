package com.oknazzal.architecture.example.feature.images.presentation;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImageDetailsBindingImpl;
import com.oknazzal.architecture.example.feature.images.presentation.databinding.ActivityImagesListBindingImpl;
import com.oknazzal.architecture.example.feature.images.presentation.databinding.RowImageBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYIMAGEDETAILS = 1;

  private static final int LAYOUT_ACTIVITYIMAGESLIST = 2;

  private static final int LAYOUT_ROWIMAGE = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.oknazzal.architecture.example.feature.images.presentation.R.layout.activity_image_details, LAYOUT_ACTIVITYIMAGEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.oknazzal.architecture.example.feature.images.presentation.R.layout.activity_images_list, LAYOUT_ACTIVITYIMAGESLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.oknazzal.architecture.example.feature.images.presentation.R.layout.row_image, LAYOUT_ROWIMAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYIMAGEDETAILS: {
          if ("layout/activity_image_details_0".equals(tag)) {
            return new ActivityImageDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_image_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYIMAGESLIST: {
          if ("layout/activity_images_list_0".equals(tag)) {
            return new ActivityImagesListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_images_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWIMAGE: {
          if ("layout/row_image_0".equals(tag)) {
            return new RowImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_image is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.oknazzal.architecture.example.core.components.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "image");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_image_details_0", com.oknazzal.architecture.example.feature.images.presentation.R.layout.activity_image_details);
      sKeys.put("layout/activity_images_list_0", com.oknazzal.architecture.example.feature.images.presentation.R.layout.activity_images_list);
      sKeys.put("layout/row_image_0", com.oknazzal.architecture.example.feature.images.presentation.R.layout.row_image);
    }
  }
}
