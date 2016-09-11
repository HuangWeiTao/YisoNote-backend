package YisoNote.common.helper;

import YisoNote.note.model.Folder;
import YisoNote.note.viewModel.FolderView;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by Ken on 2016/9/11.
 */
public class ModelMapperHelper {
     private static final ModelMapper mapper;
     static {
          mapper = new ModelMapper();

          Configure();
     }

     private static void Configure(){
          ConfigureFolder();
     }

     private static void ConfigureFolder(){

          PropertyMap<Folder, FolderView> mapFrom = new PropertyMap<Folder, FolderView>() {
               @Override
               protected void configure() {
                    map().setUpdateTime(source.getUpdateTime());
                    map().setCreateTime(source.getCreateTime());
                    map().setDescription(source.getDescription());
                    map().setName(source.getName());
                    map().setId(source.getId());
                    map().setParentFolderId(source.getParentFolder());
               }
          };
          mapper.addMappings(mapFrom);

          PropertyMap<FolderView, Folder> mapTo = new PropertyMap<FolderView, Folder>() {
               @Override
               protected void configure() {
                    throw new NotImplementedException();
               }
          };
          mapper.addMappings(mapTo);
     }

     public static ModelMapper GetMapper(){
          return mapper;
     }
}
