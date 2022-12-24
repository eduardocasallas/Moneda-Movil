package com.unab.banca.Service;
import com.unab.banca.Models.Transaccion;
import com.unab.banca.Dao.TransaccionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionDao cuentaDao;
    
    @Transactional(readOnly=false)
    public Transaccion save(Transaccion cuenta) {
        return cuentaDao.save(cuenta);
    }
    @Transactional(readOnly=false)
    public void delete(String id) {
        cuentaDao.deleteById(id);;
    }
    @Transactional(readOnly=true)
    public Transaccion findById(String id) {
       return cuentaDao.findById(id).orElse(null);
    }
    @Transactional(readOnly=true)
    public List<Transaccion> findByAll() {
        return (List<Transaccion>) cuentaDao.findAll();
    }

}
