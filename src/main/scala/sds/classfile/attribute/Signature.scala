package sds.classfile.attribute

class Signature(_signature: String) extends AttributeInfo {
    def signature: String = _signature
    override def toString(): String = "Signature: " + signature
}