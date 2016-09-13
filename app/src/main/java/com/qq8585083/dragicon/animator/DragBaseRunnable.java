package com.qq8585083.dragicon.animator;

import android.view.animation.Interpolator;
import android.widget.ImageView;

import com.qq8585083.dragicon.BaseAnimator;
import com.qq8585083.dragicon.DragView;


public abstract class DragBaseRunnable extends BaseAnimator {

	protected final DragView mDragParent;
	protected final ImageView mDragView;
	protected final ImageView mDeleteView;

	public DragBaseRunnable(DragView dragParent, ImageView dragView,
			ImageView deleteView, long duration, Interpolator interpolator) {
		super(dragParent, duration, interpolator);
		mDragParent = dragParent;
		mDragView = dragView;
		mDeleteView = deleteView;
		mDuration = duration;
		mInterpolator = interpolator;
	}
}
