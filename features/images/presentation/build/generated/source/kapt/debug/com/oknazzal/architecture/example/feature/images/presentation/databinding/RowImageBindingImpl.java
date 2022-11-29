package com.oknazzal.architecture.example.feature.images.presentation.databinding;
import com.oknazzal.architecture.example.feature.images.presentation.R;
import com.oknazzal.architecture.example.feature.images.presentation.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RowImageBindingImpl extends RowImageBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowImageBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private RowImageBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            );
        this.imageViewRowImage.setTag(null);
        this.imageViewRowUserImage.setTag(null);
        this.imageViewRowUserName.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
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
        java.lang.String imageUserImageURL = null;
        java.lang.String imageUser = null;
        java.lang.String imageLargeImageURL = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (image != null) {
                    // read image.userImageURL
                    imageUserImageURL = image.getUserImageURL();
                    // read image.user
                    imageUser = image.getUser();
                    // read image.largeImageURL
                    imageLargeImageURL = image.getLargeImageURL();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.oknazzal.architecture.example.core.components.binding.BindingAdaptersKt.setImageUrl(this.imageViewRowImage, imageLargeImageURL);
            com.oknazzal.architecture.example.core.components.binding.BindingAdaptersKt.setCircleImageUrl(this.imageViewRowUserImage, imageUserImageURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.imageViewRowUserName, imageUser);
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