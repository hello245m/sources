package j.b.p.j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import j.g.t.h;
import java.lang.reflect.Method;

/* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
public class j extends j.b.p.j.c implements MenuItem {
    public final j.g.m.a.b d;
    public Method e;

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class a extends j.g.t.h {
        public final ActionProvider b;
        public final /* synthetic */ j c;

        public a(j jVar, Context context, ActionProvider actionProvider) {
        }

        @Override // j.g.t.h
        public boolean a() {
        }

        @Override // j.g.t.h
        public View c() {
        }

        @Override // j.g.t.h
        public boolean e() {
        }

        @Override // j.g.t.h
        public void f(SubMenu subMenu) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class b extends a implements ActionProvider.VisibilityListener {
        public h.b d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
        }

        @Override // j.g.t.h
        public boolean b() {
        }

        @Override // j.g.t.h
        public View d(MenuItem menuItem) {
        }

        @Override // j.g.t.h
        public boolean g() {
        }

        @Override // j.g.t.h
        public void j(h.b bVar) {
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public static class c extends FrameLayout implements j.b.p.c {
        public final CollapsibleActionView a;

        public c(View view) {
        }

        public View a() {
        }

        @Override // j.b.p.c
        public void c() {
        }

        @Override // j.b.p.c
        public void f() {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener a;
        public final /* synthetic */ j b;

        public d(j jVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
        }
    }

    /* loaded from: C:\Users\elonm\Documents\fdtool\gzhdex\00O000ll111l_0.dex */
    public class e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener a;
        public final /* synthetic */ j b;

        public e(j jVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
        }
    }

    public j(Context context, j.g.m.a.b bVar) {
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
    }

    @Override // android.view.MenuItem
    public View getActionView() {
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
    }

    @Override // android.view.MenuItem
    public int getItemId() {
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
    }

    @Override // android.view.MenuItem
    public int getOrder() {
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
    }

    public void h(boolean z) {
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
    }
}
