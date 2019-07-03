// Generated code from Butter Knife. Do not modify!
package com.codepath.apps.restclienttemplate;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TweetDetailsActivity_ViewBinding<T extends TweetDetailsActivity> implements Unbinder {
  protected T target;

  @UiThread
  public TweetDetailsActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.ivProfileImage = Utils.findRequiredViewAsType(source, R.id.ivProfileImage, "field 'ivProfileImage'", ImageView.class);
    target.tvUserName = Utils.findRequiredViewAsType(source, R.id.tvUserName, "field 'tvUserName'", TextView.class);
    target.tvBody = Utils.findRequiredViewAsType(source, R.id.tvBody, "field 'tvBody'", TextView.class);
    target.tvTimestamp = Utils.findRequiredViewAsType(source, R.id.tvTimestamp, "field 'tvTimestamp'", TextView.class);
    target.btnRetweet = Utils.findRequiredViewAsType(source, R.id.btnRetweet, "field 'btnRetweet'", Button.class);
    target.btnFavorite = Utils.findRequiredViewAsType(source, R.id.btnFavorite, "field 'btnFavorite'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.ivProfileImage = null;
    target.tvUserName = null;
    target.tvBody = null;
    target.tvTimestamp = null;
    target.btnRetweet = null;
    target.btnFavorite = null;

    this.target = null;
  }
}
