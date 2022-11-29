package com.oknazzal.architecture.example.feature.images.presentation.databinding;
import com.oknazzal.architecture.example.feature.images.presentation.R;
import com.oknazzal.architecture.example.feature.images.presentation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityImageDetailsBindingImpl extends ActivityImageDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.text_view_image_type_label, 11);
        sViewsWithIds.put(R.id.text_view_image_size_label, 12);
        sViewsWithIds.put(R.id.text_view_image_tags_label, 13);
        sViewsWithIds.put(R.id.progress_bar, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityImageDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityImageDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (android.widget.ProgressBar) bindings[14]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.imageViewImage.setTag(null);
        this.imageViewUserImage.setTag(null);
        this.imageViewUserName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textViewCommentsCount.setTag(null);
        this.textViewDownloadsCount.setTag(null);
        this.textViewImageSize.setTag(null);
        this.textViewImageTags.setTag(null);
        this.textViewImageType.setTag(null);
        this.textViewLikesCount.setTag(null);
        this.textViewViewsCount.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.image == variableId) {
            setImage((com.oknazzal.architecture.example.feature.images.domain.model.ImageModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImage(@Nullable com.oknazzal.architecture.example.feature.images.domain.model.ImageModel Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.oknazzal.architecture.example.feature.images.domain.model.ImageModel image = mImage;
        int androidxDatabindingViewDataBindingSafeUnboxImageImageSize = 0;
        int androidxDatabindingViewDataBindingSafeUnboxImageLikes = 0;
        int androidxDatabindingViewDataBindingSafeUnboxImageViews = 0;
        java.lang.String imageUserImageURL = null;
        java.lang.Integer imageLikes = null;
        java.lang.Integer imageComments = null;
        java.lang.String imageUser = null;
        java.lang.String imageLargeImageURL = null;
        java.lang.Integer imageImageSize = null;
        android.content.res.Resources contextResources = null;
        int comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViews = 0;
        int comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikes = 0;
        java.lang.String stringValueOfImageImageSize = null;
        int comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelComments = 0;
        java.lang.Integer imageViews = null;
        java.lang.String contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikesImageLikesImageLikes = null;
        java.lang.String imageType = null;
        java.lang.String contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViewsImageViewsImageViews = null;
        java.lang.String contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelCommentsImageCommentsImageComments = null;
        int androidxDatabindingViewDataBindingSafeUnboxImageComments = 0;
        java.lang.String imageTags = null;

        if ((dirtyFlags & 0x3L) != 0) {

                // read context.resources
                contextResources = getRoot().getContext().getResources();
                // read com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_views
                comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViews = com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_views;
                // read com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_likes
                comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikes = com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_likes;
                // read com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_comments
                comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelComments = com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_comments;


                if (image != null) {
                    // read image.userImageURL
                    imageUserImageURL = image.getUserImageURL();
                    // read image.likes
                    imageLikes = image.getLikes();
                    // read image.comments
                    imageComments = image.getComments();
                    // read image.user
                    imageUser = image.getUser();
                    // read image.largeImageURL
                    imageLargeImageURL = image.getLargeImageURL();
                    // read image.imageSize
                    imageImageSize = image.getImageSize();
                    // read image.views
                    imageViews = image.getViews();
                    // read image.type
                    imageType = image.getType();
                    // read image.tags
                    imageTags = image.getTags();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(image.likes)
                androidxDatabindingViewDataBindingSafeUnboxImageLikes = androidx.databinding.ViewDataBinding.safeUnbox(imageLikes);
                // read androidx.databinding.ViewDataBinding.safeUnbox(image.comments)
                androidxDatabindingViewDataBindingSafeUnboxImageComments = androidx.databinding.ViewDataBinding.safeUnbox(imageComments);
                // read androidx.databinding.ViewDataBinding.safeUnbox(image.imageSize)
                androidxDatabindingViewDataBindingSafeUnboxImageImageSize = androidx.databinding.ViewDataBinding.safeUnbox(imageImageSize);
                // read androidx.databinding.ViewDataBinding.safeUnbox(image.views)
                androidxDatabindingViewDataBindingSafeUnboxImageViews = androidx.databinding.ViewDataBinding.safeUnbox(imageViews);


                if (contextResources != null) {
                    // read context.resources.getQuantityString(com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_likes, androidx.databinding.ViewDataBinding.safeUnbox(image.likes), image.likes)
                    contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikesImageLikesImageLikes = contextResources.getQuantityString(comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikes, androidxDatabindingViewDataBindingSafeUnboxImageLikes, imageLikes);
                    // read context.resources.getQuantityString(com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_comments, androidx.databinding.ViewDataBinding.safeUnbox(image.comments), image.comments)
                    contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelCommentsImageCommentsImageComments = contextResources.getQuantityString(comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelComments, androidxDatabindingViewDataBindingSafeUnboxImageComments, imageComments);
                    // read context.resources.getQuantityString(com.oknazzal.architecture.example.feature.images.presentation.R.plurals.label_views, androidx.databinding.ViewDataBinding.safeUnbox(image.views), image.views)
                    contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViewsImageViewsImageViews = contextResources.getQuantityString(comOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViews, androidxDatabindingViewDataBindingSafeUnboxImageViews, imageViews);
                }
                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(image.imageSize))
                stringValueOfImageImageSize = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxImageImageSize);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.oknazzal.architecture.example.core.components.binding.BindingAdaptersKt.setImageUrl(this.imageViewImage, imageLargeImageURL);
            com.oknazzal.architecture.example.core.components.binding.BindingAdaptersKt.setCircleImageUrl(this.imageViewUserImage, imageUserImageURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.imageViewUserName, imageUser);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewCommentsCount, contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelCommentsImageCommentsImageComments);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewDownloadsCount, contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViewsImageViewsImageViews);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewImageSize, stringValueOfImageImageSize);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewImageTags, imageTags);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewImageType, imageType);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewLikesCount, contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelLikesImageLikesImageLikes);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textViewViewsCount, contextResourcesGetQuantityStringComOknazzalArchitectureExampleFeatureImagesPresentationRPluralsLabelViewsImageViewsImageViews);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}