package uooconline.com.teacher.ui.view

import com.ricky.mvp_core.base.interfaces.IView
import uooconline.com.nucleus.utils.impl.IList
import uooconline.com.teacher.request.Bymonth
import uooconline.com.teacher.request.OneIdlist
import uooconline.com.teacher.request.OneList

interface IOneFragment : IView {
    /**
     * 获取最新 idlist
     */
    fun obtainIdList(ids: List<String>?) = Unit

    fun setMessage(content: String)= Unit

    fun obtainOneList(content: OneList.Data?)= Unit
    fun obtainBymonth(content: Bymonth.Data?)= Unit
}