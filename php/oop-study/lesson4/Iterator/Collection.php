<?php
class Collection implements Iterator{   
    protected $total=0;        
    private $pointer=0;
    private $objects=array();
    
    public function getQuantity(){
    	//возвращает количество элементов в коллекции
    	return $this->total;
    }
    function add(DomainObject $object){       
        $this->objects[$this->total]=$object;
        $this->total++;
    }   
    private function getRow($num){        
        if ($num>=$this->total){
            return null;
        }
        
        if (isset($this->objects[$num])){
            return $this->objects[$num];
        }
    }    
    public function rewind(){
        $this->pointer=0;
    }    
    public function current(){
        return $this->getRow($this->pointer);
    }    
    public function key(){
        return $this->pointer;
    }    
    public function next(){
        $row=$this->getRow($this->pointer);
        if ($row){
            $this->pointer++;
        }
        return $row;
    }    
    public function valid(){
        return(! is_null($this->current()));
    }
}
?>