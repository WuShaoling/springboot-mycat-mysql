package com.wsl.mycat.error;

public enum ErrorCode {

    @ErrorMessage("操作成功")
    Success(0),

    @ErrorMessage("服务器出错，请联系管理员")
    GeneralError(Integer.MAX_VALUE),

    @ErrorMessage("请求出错，请联系管理员")
    QueryEInfoException(101),

    @ErrorMessage("商品名范围为在60字符以内")
    ProductNameTooLongException(102),

    @ErrorMessage("商品售价范围为在1000000以内")
    ProductSalePriceExceedException(103),

    @ErrorMessage("商品单位字符数控制在8个字符以内")
    ProductUomLengthExceed(104),

    @ErrorMessage("商品起批量范围在9999以内")
    ProductMoqExceedException(105),

    @ErrorMessage("客户联系人姓名不能为空")
    DealerContactNameIsNullException(106),

    @ErrorMessage("客户联系人电话或移动电话至少一项不为空")
    DealerContactTelIsNullException(107),

    @ErrorMessage("写入新订单收款异常，请联系管理员")
    PayResultInsertBillException(108),

    @ErrorMessage("写入新订单异常，请联系管理员")
    PayResultInsertOrderException(109);


    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getErrorStringFormat() {
        String format = "";
        try {
            format = ErrorCode.class.getDeclaredField(this.toString()).getAnnotation(ErrorMessage.class).value();
        } catch (NoSuchFieldException ex) {
            //Impossible to occur
        }
        return format;
    }
}
