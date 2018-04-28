package uooconline.com.education.model.schedule.viewbinder

import android.view.View
import uooconline.com.nucleus.widget.treelist.TreeNode
import uooconline.com.nucleus.widget.treelist.TreeViewBinder
import uooconline.com.teacher.R
import uooconline.com.teacher.request.model.bean.Type2
import uooconline.com.teacher.request.model.bean.Type3

class Type3Binder() : TreeViewBinder<Type3Binder.ViewHolder>() {
    override fun provideViewHolder(itemView: View): ViewHolder = ViewHolder(itemView)

    override fun getLayoutId(): Int = R.layout.item_schedule_type3

    override fun bindView(holder: ViewHolder, position: Int, node: TreeNode<*>) {
        val item = node.content as Type3
//        holder.mTitle.text = item.title
    }

    class ViewHolder(rootView: View) : TreeViewBinder.ViewHolder(rootView) {
//        val mTitle: TextView = rootView.findViewById(R.id.title)
//        val mArrow: ImageView = rootView.findViewById(R.id.arrow_pic)

    }



    override fun onPaddingHeight(holder: ViewHolder, height: Int) {
        super.onPaddingHeight(holder, height)
        holder.itemView.setPadding(0, 0, 0, 0)
    }
}