// Generated by data binding compiler. Do not edit!
package com.oknazzal.architecture.example.feature.images.presentation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.oknazzal.architecture.example.feature.images.domain.model.ImageModel;
import com.oknazzal.architecture.example.feature.images.presentation.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityImageDetailsBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imageViewImage;

  @NonNull
  public final AppCompatImageView imageViewUserImage;

  @NonNull
  public final AppCompatTextView imageViewUserName;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final AppCompatTextView textViewCommentsCount;

  @NonNull
  public final AppCompatTextView textViewDownloadsCount;

  @NonNull
  public final AppCompatTextView textViewImageSize;

  @NonNull
  public final AppCompatTextView textViewImageSizeLabel;

  @NonNull
  public final AppCompatTextView textViewImageTags;

  @NonNull
  public final AppCompatTextView textViewImageTagsLabel;

  @NonNull
  public final AppCompatTextView textViewImageType;

  @NonNull
  public final AppCompatTextView textViewImageTypeLabel;

  @NonNull
  public final AppCompatTextView textViewLikesCount;

  @NonNull
  public final AppCompatTextView textViewViewsCount;

  @Bindable
  protected ImageModel mImage;

  protected ActivityImageDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imageViewImage, AppCompatImageView imageViewUserImage,
      AppCompatTextView imageViewUserName, ProgressBar progressBar,
      AppCompatTextView textViewCommentsCount, AppCompatTextView textViewDownloadsCount,
      AppCompatTextView textViewImageSize, AppCompatTextView textViewImageSizeLabel,
      AppCompatTextView textViewImageTags, AppCompatTextView textViewImageTagsLabel,
      AppCompatTextView textViewImageType, AppCompatTextView textViewImageTypeLabel,
      AppCompatTextView textViewLikesCount, AppCompatTextView textViewViewsCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageViewImage = imageViewImage;
    this.imageViewUserImage = imageViewUserImage;
    this.imageViewUserName = imageViewUserName;
    this.progressBar = progressBar;
    this.textViewCommentsCount = textViewCommentsCount;
    this.textViewDownloadsCount = textViewDownloadsCount;
    this.textViewImageSize = textViewImageSize;
    this.textViewImageSizeLabel = textViewImageSizeLabel;
    this.textViewImageTags = textViewImageTags;
    this.textViewImageTagsLabel = textViewImageTagsLabel;
    this.textViewImageType = textViewImageType;
    this.textViewImageTypeLabel = textViewImageTypeLabel;
    this.textViewLikesCount = textViewLikesCount;
    this.textViewViewsCount = textViewViewsCount;
  }

  public abstract void setImage(@Nullable ImageModel image);

  @Nullable
  public ImageModel getImage() {
    return mImage;
  }

  @NonNull
  public static ActivityImageDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_image_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImageDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityImageDetailsBinding>inflateInternal(inflater, R.layout.activity_image_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityImageDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_image_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityImageDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityImageDetailsBinding>inflateInternal(inflater, R.layout.activity_image_details, null, false, component);
  }

  public static ActivityImageDetailsBinding bind(@NonNull View view) {
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
  public static ActivityImageDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityImageDetailsBinding)bind(component, view, R.layout.activity_image_details);
  }
}