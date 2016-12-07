/*
 * 类说明:ReactNative学习
 * @name LiangAn
 * @data 2016年12月07日 15:14:55
 */
import React from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  NativeModules,
  View
} from 'react-native';

class TwoTestReact extends React.Component{
   render() {
     return (
       <View style={styles.container}>
         <Text style={styles.hello}
         onPress={this.call_button.bind(this)}>React Native to LiangAn </Text>
       </View>
     )
   }
   call_button(){
      	 NativeModules.MyNativeModule.rnCallNative('调用原生方法的--rnCallNative()');
      }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

AppRegistry.registerComponent('TwoTestReact', () => TwoTestReact);

