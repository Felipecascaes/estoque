package estoque;

import com.gerenciamento.estoque.dto.EmpresaDto;
import com.gerenciamento.estoque.model.EmpresaModel;
import com.gerenciamento.estoque.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }
    public EmpresaModel salvar(EmpresaDto dto){
        EmpresaModel empresa = new EmpresaModel();
        empresa.setNmFantasia(dto.nmFantasia());
        empresa.setNmRazao(dto.nmRazao());
        empresa.setNuCnpj(dto.nuCnpj());
        empresa.setFlAtivo(dto.flAtivo());
        empresa.setDsEndereco(dto.dsEndereco());
        empresa.setNuEndereco(dto.nuEndereco());
        return empresaRepository.save(empresa);
    }
}
