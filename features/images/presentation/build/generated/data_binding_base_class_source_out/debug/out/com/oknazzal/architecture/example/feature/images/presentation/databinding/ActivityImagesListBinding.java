// Generated by data binding compiler. Do not edit!
package com.oknazzal.architecture.example.feature.images.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.oknazzal.architecture.example.feature.images.presentation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityImagesListBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView recyclerViewImages;

  protected ActivityImagesListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar progressBar, RecyclerView recyclerViewImages) {
    super(_bindingComponent, _root, _localFieldCount);
    this.progressBar = progressBar;
    this.recyclerViewImages = recyclerViewImages;
  }

  @NonNull
  public static ActivityImagesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_images_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImagesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityImagesListBinding>inflateInternal(inflater, R.layout.activity_images_list, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityImagesListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_images_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImagesListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityImagesListBinding>inflateInternal(inflater, R.layout.activity_images_list, null, false, component);
  }

  public static ActivityImagesListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityImagesListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityImagesListBinding)bind(component, view, R.layout.activity_images_list);
  }
}
